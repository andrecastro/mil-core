package br.edu.ifce.ppd.tria.core.protocol;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by andrecoelho on 2/17/16.
 */
public class Action implements Serializable {

    private String path;
    private HashMap<String, Serializable> body;

    public Action(String path, HashMap<String, Serializable> body) {
        this.path = path;
        this.body = body;
    }

    public HashMap<String, Serializable> getBody() {
        return body;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Path: "  + path + ", body: " + body;
    }
}
