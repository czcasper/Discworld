/*
 */
package cz.a_d.discworld.x3dom.data.apprance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Appearance {
// TODO validate this definition and implement child dependecies
    /**
     * Specify the threshold for the alpha clipping.
     */
    @XmlAttribute
    protected Float alphaClipThreshold;

    /**
     * Holds the BlendMode node, that is needed for correct transparency.
     */
    protected BlendMode blendMode;

    /**
     * Holds a ColorMaskMode node.
     */
    protected ColorMaskMode colorMaskMode;

    /**
     * Holds the depthMode node.
     */
    protected DepthMode depthMode;

    /**
     * The lineProperties field, if specified, shall contain a LineProperties node. If lineProperties is NULL or unspecified, the
     * lineProperties field has no effect.
     */
    protected LineProperties lineProperties;

    /**
     * The material field, if specified, shall contain a Material node. If the material field is NULL or unspecified, lighting is off (all
     * lights are ignored during rendering of the object that references this Appearance) and the unlit object colour is (1, 1, 1).
     */
    protected X3DMaterial material;

    /**
     * Field to add metadata information.
     */
    protected X3DMetadataObject metadata;

    /**
     * Contains ProgramShader (Cg) or ComposedShader (GLSL).
     */
    protected X3DShaderNode shaders;

    /**
     * Defines the shape type for sorting.
     */
    protected ShapeSortType sortType;

    /**
     * The texture field, if specified, shall contain a texture nodes. If the texture node is NULL or the texture field is unspecified, the
     * object that references this Appearance is not textured.
     */
    protected X3DTextureNode texture;

    /**
     * The textureTransform field, if specified, shall contain a TextureTransform node. If the textureTransform is NULL or unspecified, the
     * textureTransform field has no effect.
     */
    protected X3DTextureTransformNode textureTransform;

    /**
     * Get the value of textureTransform
     *
     * @return the value of textureTransform
     */
    public X3DTextureTransformNode getTextureTransform() {
        return textureTransform;
    }

    /**
     * Set the value of textureTransform
     *
     * @param textureTransform new value of textureTransform
     */
    public void setTextureTransform(X3DTextureTransformNode textureTransform) {
        this.textureTransform = textureTransform;
    }

    /**
     * Get the value of texture
     *
     * @return the value of texture
     */
    public X3DTextureNode getTexture() {
        return texture;
    }

    /**
     * Set the value of texture
     *
     * @param texture new value of texture
     */
    public void setTexture(X3DTextureNode texture) {
        this.texture = texture;
    }

    /**
     * Get the value of sortType
     *
     * @return the value of sortType
     */
    public ShapeSortType getSortType() {
        return sortType;
    }

    /**
     * Set the value of sortType
     *
     * @param sortType new value of sortType
     */
    public void setSortType(ShapeSortType sortType) {
        this.sortType = sortType;
    }

    /**
     * Change render order manually.
     */
    protected Integer sortKey;

    /**
     * Get the value of sortKey
     *
     * @return the value of sortKey
     */
    public Integer getSortKey() {
        return sortKey;
    }

    /**
     * Set the value of sortKey
     *
     * @param sortKey new value of sortKey
     */
    public void setSortKey(Integer sortKey) {
        this.sortKey = sortKey;
    }

    /**
     * Get the value of shaders
     *
     * @return the value of shaders
     */
    public X3DShaderNode getShaders() {
        return shaders;
    }

    /**
     * Set the value of shaders
     *
     * @param shaders new value of shaders
     */
    public void setShaders(X3DShaderNode shaders) {
        this.shaders = shaders;
    }

    /**
     * Get the value of metadata
     *
     * @return the value of metadata
     */
    public X3DMetadataObject getMetadata() {
        return metadata;
    }

    /**
     * Set the value of metadata
     *
     * @param metadata new value of metadata
     */
    public void setMetadata(X3DMetadataObject metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the value of material
     *
     * @return the value of material
     */
    public X3DMaterial getMaterial() {
        return material;
    }

    /**
     * Set the value of material
     *
     * @param material new value of material
     */
    public void setMaterial(X3DMaterial material) {
        this.material = material;
    }

    /**
     * Get the value of lineProperties
     *
     * @return the value of lineProperties
     */
    public LineProperties getLineProperties() {
        return lineProperties;
    }

    /**
     * Set the value of lineProperties
     *
     * @param lineProperties new value of lineProperties
     */
    public void setLineProperties(LineProperties lineProperties) {
        this.lineProperties = lineProperties;
    }

    /**
     * Get the value of depthMode
     *
     * @return the value of depthMode
     */
    public DepthMode getDepthMode() {
        return depthMode;
    }

    /**
     * Set the value of depthMode
     *
     * @param depthMode new value of depthMode
     */
    public void setDepthMode(DepthMode depthMode) {
        this.depthMode = depthMode;
    }

    /**
     * Get the value of colorMaskMode
     *
     * @return the value of colorMaskMode
     */
    public ColorMaskMode getColorMaskMode() {
        return colorMaskMode;
    }

    /**
     * Set the value of colorMaskMode
     *
     * @param colorMaskMode new value of colorMaskMode
     */
    public void setColorMaskMode(ColorMaskMode colorMaskMode) {
        this.colorMaskMode = colorMaskMode;
    }

    /**
     * Get the value of blendMode
     *
     * @return the value of blendMode
     */
    public BlendMode getBlendMode() {
        return blendMode;
    }

    /**
     * Set the value of blendMode
     *
     * @param blendMode new value of blendMode
     */
    public void setBlendMode(BlendMode blendMode) {
        this.blendMode = blendMode;
    }

    /**
     * Get the value of alphaClipThreshold
     *
     * @return the value of alphaClipThreshold
     */
    public Float getAlphaClipThreshold() {
        return alphaClipThreshold;
    }

    /**
     * Set the value of alphaClipThreshold
     *
     * @param alphaClipThreshold new value of alphaClipThreshold
     */
    public void setAlphaClipThreshold(Float alphaClipThreshold) {
        this.alphaClipThreshold = alphaClipThreshold;
    }

}
