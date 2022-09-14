package com.spring.SpringInyectionPoint;

import static org.assertj.core.api.Assertions.assertThat;import org.hamcrest.collection.IsArrayWithSize;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GreeterServiceIntegrationTests {

  @Autowired
  private GreeterService greeterService;

  @Test
  public void sayHello_whenGivenDuke_thenReturnsHelloWorldDuke() {

    // Given
    String caller = "Duke";

    // When
    String greeting = greeterService.sayHello(caller);

    // Then
    assertThat(greeting).isEqualTo("Hola caracola, Duke");

  }
  
  @Test
  public void sayHello_whenGivenDuke_thenReturnsHelloWorldDuke2() {

    // Given
    String caller = "Duke";

    // When
    String greeting = greeterService.sayHello2(caller);

    // Then
    assertThat(greeting).isEqualTo("Hello World, Duke");

  }
  
  @Test
  public void sayHello_whenGivenDuke_thenReturnsHelloWorldDuke3() {

    // Given
    String caller = "Duke";

    // When
    String greeting = greeterService.sayHello3(caller);

    // Then
    assertThat(greeting).isEqualTo("Ángela Merkel, Duke");

  }
}