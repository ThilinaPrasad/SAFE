/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.vighnesh.api.virustotal;

/**
 *
 * @author BVR
 */
public class InvalidResourceEception extends RuntimeException {

    /**
     *
     */
    public InvalidResourceEception() {
    }

    /**
     *
     * @param message
     */
    public InvalidResourceEception(String message) {
        super(message);
    }

    /**
     *
     * @param cause
     */
    public InvalidResourceEception(Throwable cause) {
        super(cause);
    }

    /**
     *
     * @param message
     * @param cause
     */
    public InvalidResourceEception(String message, Throwable cause) {
        super(message, cause);
    }

}
