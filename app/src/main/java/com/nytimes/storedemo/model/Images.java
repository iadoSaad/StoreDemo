package com.nytimes.storedemo.model;

import org.immutables.value.Value;

/**
 * Created by brianplummer on 12/19/15.
 */
@Value.Immutable
public abstract class Images {
    public abstract Image source();
}