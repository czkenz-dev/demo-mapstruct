package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooMapperTest {

    @Test
    public void shouldMapFooDtoToFoo() {
        // given
        FooDto fooDto = new FooDto("BAR", 8888);

        // when
        Foo foo = FooMapper.INSTANCE.fooDtoToFoo(fooDto);

        // then
        assertEquals("BAR/8888", foo.getBar());
        assertEquals("8888", foo.getBaz());
    }

    @Test
    public void shouldMapFooTpFooDto() {
        // given
        Foo foo = new Foo("BAR", "8888");

        // when
        FooDto fooDto = FooMapper.INSTANCE.fooToFooDto(foo);

        // then
        assertEquals("BAR", fooDto.getBr());
        assertEquals(8888, fooDto.getBz());
    }
}
