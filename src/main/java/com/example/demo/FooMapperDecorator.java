package com.example.demo;

public abstract class FooMapperDecorator implements FooMapper {

    private final FooMapper delegate;

    public FooMapperDecorator(FooMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public Foo fooDtoToFoo(FooDto fooDto) {
        Foo foo = delegate.fooDtoToFoo(fooDto);
        foo.setBar(fooDto.getBr() + "/" + fooDto.getBz());
        return foo;
    }
}
