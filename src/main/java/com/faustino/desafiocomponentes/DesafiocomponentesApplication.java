package com.faustino.desafiocomponentes;

import com.faustino.entities.Order;
import com.faustino.services.OrderService;
import com.faustino.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.faustino"})
public class DesafiocomponentesApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(DesafiocomponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,95.90,0.0);

		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total %.2f%n" , orderService.total(order));

	}
}
