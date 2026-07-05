package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.jcip.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes5.dex */
public class Container<T> {
    private T item;

    public Container() {
    }

    public Container(T t) {
        this.item = t;
    }

    public T get() {
        return this.item;
    }

    public void set(T t) {
        this.item = t;
    }
}
