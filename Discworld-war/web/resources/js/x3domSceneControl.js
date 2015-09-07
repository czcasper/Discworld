/* 
 */

var parser = new DOMParser();
function test() {
    addObject('<transforms><transform translation="0 0 0"><shape><appearance><material diffuseColor="0 0 1"/></appearance><box size="1,1,1"/></shape></transform><transform translation="1 0 0"><shape><appearance><material diffuseColor="0 0 1"/></appearance><box size="1,1,1"/></shape></transform></transforms>');
}

function findX3DElements() {
    var list = document.getElementsByTagName("x3d");
    // TODO dynamic size detection
}

function mergeNodes(original, newdata) {
    for (var i = 0; i < newdata.attributes.length; i++) {
        var attrib = newdata.attributes[i];
        original.setAttribute(attrib.nodeName, attrib.nodeValue);
    }

    for (var i = 0; i < newdata.childNodes.length; i++) {
        var data = newdata.childNodes[i];
        var itemId = data.getAttribute('id');
        var xmlItem = document.getElementById(itemId);
        if (xmlItem !== null) {
            mergeNodes(xmlItem, data);
        } else {
            var addopted = document.adoptNode(data);
            xmlItem.appendChild(addopted);
        }
    }


}

function updateScene(def) {
    var doc = parser.parseFromString(def, "text/xml");
    var deltaMessages = doc.getElementsByTagName("x3dDelta");
    if (deltaMessages.length >= 0) {
        var arrayLength = deltaMessages.length;
        for (var i = 0; i < arrayLength; i++) {
            var message = deltaMessages[i];
            var operation = message.getAttribute('operationType').toLowerCase();
            var rootId = message.getAttribute('parentID');
            var parent = document.getElementById(rootId);

            if (operation === "create") {
                var dataArray = message.childNodes;
                var dataLength = dataArray.length;
                for (var j = 0; j < dataLength; j++) {
                    var data = dataArray[j];
                    var addopted = document.adoptNode(data);
                    parent.appendChild(addopted);
                }
            } else if (operation === "delete") {
                var dataArray = message.childNodes;
                var dataLength = dataArray.length;
                for (var j = 0; j < dataLength; j++) {
                    var data = dataArray[j];
                    var itemId = data.getAttribute('id');
                    var xmlItem = document.getElementById(itemId);
                    parent.removeChild(xmlItem);
                }
            } else if (operation === "update") {
                var dataArray = message.childNodes;
                var dataLength = dataArray.length;
                for (var j = 0; j < dataLength; j++) {
                    var data = dataArray[j];
                    var itemId = data.getAttribute('id');
                    var xmlItem = document.getElementById(itemId);
                    if (xmlItem !== null) {
                        mergeNodes(xmlItem, data);
                    } else {
                        var addopted = document.adoptNode(data);
                        xmlItem.appendChild(addopted);
                    }
                }
            }

        }
        return true;
    }
    return false;
}
