package org.example.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ToReleaseContainer {
    ToRelease[] value();
}
