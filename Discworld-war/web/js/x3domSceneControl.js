/* 
 */

var parser = new DOMParser();
function test() {
    addObject('<transforms><transform translation="0 0 0"><shape><appearance><material diffuseColor="0 0 1"/></appearance><box size="1,1,1"/></shape></transform><transform translation="1 0 0"><shape><appearance><material diffuseColor="0 0 1"/></appearance><box size="1,1,1"/></shape></transform></transforms>');
}

function addObject(def) {
    var doc = parser.parseFromString(def, "text/xml");
    var ot = document.getElementById('root');
    var rootName = doc.firstChild.nodeName.toUpperCase();
    if (rootName === "TRANSFORMS") {
        var transforms = doc.firstChild;
        var childs = transforms.firstChild;
        while (childs !== null) {
            var addopted = document.adoptNode(childs);
            ot.appendChild(addopted);
            childs = transforms.firstChild;
        }
    } else if (rootName === "TRANSFORM") {
        var addopted = document.adoptNode(doc.firstChild);
        ot.appendChild(addopted);
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