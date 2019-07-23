package com.example.demo;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
@DecoratedWith(FooMapperDecorator.class)
public interface FooMapper {

    FooMapper INSTANCE = Mappers.getMapper(FooMapper.class);

    @Mapping(source = "br", target = "bar")
    @Mapping(source = "bz", target = "baz")
    Foo fooDtoToFoo(FooDto fooDto);

    @Mapping(source = "bar", target = "br")
    @Mapping(source = "baz", target = "bz")
    FooDto fooToFooDto(Foo foo);

}
