package de.tudarmstadt.ukp.inception.kb.yaml;

import java.io.Serializable;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KnowledgeBaseMapping implements Serializable
{

    private static final long serialVersionUID = 8967034943386456692L;

    @JsonProperty("class")
    private IRI classIri;

    @JsonProperty("subclass-of")
    private IRI subclassIri;

    @JsonProperty("instance-of")
    private IRI typeIri;

    @JsonProperty("description")
    private IRI descriptionIri;

    @JsonProperty("label")
    private IRI labelIri;

    @JsonProperty("property-type")
    private IRI propertyTypeIri;
    
    
    @JsonCreator
    public KnowledgeBaseMapping(@JsonProperty("class") String classIri,
            @JsonProperty("subclass-of") String subclassIri,
            @JsonProperty("instance-of") String typeIri,
            @JsonProperty("description") String descriptionIri,
            @JsonProperty("label") String labelIri,
            @JsonProperty("property-type") String propertyTypeIri)
    {
        SimpleValueFactory vf = SimpleValueFactory.getInstance();
        this.classIri = vf.createIRI(classIri);
        this.subclassIri = vf.createIRI(subclassIri);
        this.typeIri = vf.createIRI(typeIri);
        this.descriptionIri = vf.createIRI(descriptionIri);
        this.labelIri = vf.createIRI(labelIri);
        this.propertyTypeIri = vf.createIRI(propertyTypeIri);
    }
    
    public KnowledgeBaseMapping() {
        
    }

    public IRI getClassIri()
    {
        return classIri;
    }
    
    public void setClassIri(IRI aClassIri)
    {   
        classIri = aClassIri;
    }

    public IRI getSubclassIri()
    {
        return subclassIri;
    }

    public void setSubclassIri(IRI aSubclassIri)
    {
        subclassIri = aSubclassIri;
    }

    public IRI getTypeIri()
    {
        return typeIri;
    }

    public void setTypeIri(IRI aTypeIri)
    {
        typeIri = aTypeIri;
    }

    public IRI getDescriptionIri()
    {
        return descriptionIri;
    }

    public void setDescriptionIri(IRI aDescriptionIri)
    {
        descriptionIri = aDescriptionIri;
    }

    public IRI getLabelIri()
    {
        return labelIri;
    }

    public void setLabelIri(IRI aLabelIri)
    {
        labelIri = aLabelIri;
    }

    public IRI getPropertyTypeIri()
    {
        return propertyTypeIri;
    }

    public void setPropertyTypeIri(IRI aPropertyTypeIri)
    {
        propertyTypeIri = aPropertyTypeIri;
    }
    
    
}
