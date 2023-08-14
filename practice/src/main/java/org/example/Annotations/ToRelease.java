package org.example.Annotations;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ToReleaseContainer.class)
@interface ToRelease {
    String customerName();
    int version();
}
