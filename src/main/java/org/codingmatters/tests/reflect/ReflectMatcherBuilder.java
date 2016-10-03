package org.codingmatters.tests.reflect;

import org.codingmatters.tests.reflect.matchers.ClassMatcher;
import org.codingmatters.tests.reflect.matchers.ConstructorMatcher;
import org.codingmatters.tests.reflect.matchers.FieldMatcher;
import org.codingmatters.tests.reflect.matchers.MethodMatcher;
import org.codingmatters.tests.reflect.utils.AccessModifier;
import org.codingmatters.tests.reflect.utils.LevelModifier;
import org.codingmatters.tests.reflect.utils.ReflectMatcherConfiguration;

/**
 * Created by nelt on 9/21/16.
 */
public class ReflectMatcherBuilder {
    private final ReflectMatcherConfiguration configuration = new ReflectMatcherConfiguration();

    public ReflectMatcherBuilder static_() {
        this.configuration.levelModifier(LevelModifier.STATIC);
        return this;
    }

    public ReflectMatcherBuilder instance() {
        this.configuration.levelModifier(LevelModifier.INSTANCE);
        return this;
    }

    public ReflectMatcherBuilder public_() {
        this.configuration.accessModifier(AccessModifier.PUBLIC);
        return this;
    }

    public ReflectMatcherBuilder private_() {
        this.configuration.accessModifier(AccessModifier.PRIVATE);
        return this;
    }

    public ReflectMatcherBuilder protected_() {
        this.configuration.accessModifier(AccessModifier.PROTECTED);
        return this;
    }

    public ReflectMatcherBuilder packagePrivate() {
        this.configuration.accessModifier(AccessModifier.PACKAGE_PRIVATE);
        return this;
    }

    public ClassMatcher class_() {
        return ClassMatcher.aClass(this.configuration);
    }

    public ClassMatcher interface_() {
        return ClassMatcher.anInterface(this.configuration);
    }

    public FieldMatcher field() {
        return FieldMatcher.aField(this.configuration);
    }

    public MethodMatcher method() {
        return MethodMatcher.aMethod(this.configuration);
    }

    public ConstructorMatcher constructor() {
        return ConstructorMatcher.aConstructor(this.configuration);
    }
}