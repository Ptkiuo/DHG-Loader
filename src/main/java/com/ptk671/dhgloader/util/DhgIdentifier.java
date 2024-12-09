package com.ptk671.dhgloader.util;


public class DhgIdentifier {

    public static CompatIdentifier of(String namespace, String path) {
        return new CompatIdentifier(namespace, path);
    }
}