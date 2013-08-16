package org.javers.model.object.graph;

import org.javers.common.validation.Validate;
import org.javers.model.mapping.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * Relation between (Entity) instances
 *
 * @author bartosz walacik
 */
public abstract class Edge {
    protected Property property;

    protected Edge(Property property) {
        Validate.argumentIsNotNull(property);
        this.property = property;
    }

    public Property getProperty() {
        return property;
    }
}
