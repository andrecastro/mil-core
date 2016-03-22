package br.edu.ifce.ppd.tria.core.model;

import java.io.Serializable;

/**
 * Created by andrecoelho on 2/19/16.
 */
public class Client implements Serializable {

    private String id;

    private String host;

    private Integer port;

    public Client(String id) {
        this.id = id;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPort() {
        return port;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Client) || obj == null) {
            return false;
        }

        return ((Client)obj).getId().equals(getId());
    }
}
