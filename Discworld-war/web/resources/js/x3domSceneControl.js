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
            }

        }
//        var ot = document.getElementById('root');
//        var rootName = doc.firstChild.nodeName.toUpperCase();
//        if (rootName === "TRANSFORMS") {
//            var transforms = doc.firstChild;
//            var childs = transforms.firstChild;
//            while (childs !== null) {
//                var addopted = document.adoptNode(childs);
//                ot.appendChild(addopted);
//                childs = transforms.firstChild;
//            }
//        } else if (rootName === "TRANSFORM") {
//            var addopted = document.adoptNode(doc.firstChild);
//            ot.appendChild(addopted);
//        }
        return true;
    }
    return false;
}

function removeNode()
{
    var ot = document.getElementById('root');
    for (var i = 0; i < ot.childNodes.length; i++) {
        // check if we have a real X3DOM Node; not just e.g. a Text-tag
        if (ot.childNodes[i].nodeType === Node.ELEMENT_NODE) {
            ot.removeChild(ot.childNodes[i]);
            break;
        }
    }

    return false;
}

function handleCubeClick(cube)
{

}