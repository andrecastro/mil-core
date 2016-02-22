package br.edu.ifce.ppd.tria.core.protocol.helper;

import br.edu.ifce.ppd.tria.core.protocol.Action;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by andrecoelho on 2/21/16.
 */
public class ActionBuilder {

    private String path;
    private HashMap<String, Serializable> body;

    private ActionBuilder() {
        this.body = new HashMap<String, Serializable>();
    }

    public static ActionBuilder anAction() {
        return new ActionBuilder();
    }

    public ActionBuilder to(String path) {
        this.path = path;
        return this;
    }

    public ActionBuilder withParamValue(String param, Serializable value) {
        this.body.put(param, value);
        return this;
    }

    public Action build() {
        return new Action(path, body);
    }
}
