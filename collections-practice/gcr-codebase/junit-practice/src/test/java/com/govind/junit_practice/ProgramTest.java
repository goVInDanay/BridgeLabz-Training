package com.govind.junit_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProgramTest {

	private Program program;

	@BeforeEach
	public void setup() {
		program = new Program(1000);
	}

	@Test
	public void testDepositValidAmount() {
		program.deposit(500);
		assertEquals(1500, program.getBalance());
	}

	@Test
	public void testDepositNegativeAmount() {
		assertThrows(IllegalArgumentException.class, () -> {
			program.deposit(-100);
		});
	}

	@Test
	public void testWithdrawValidAmount() {
		program.withdraw(100);
		assertEquals(900, program.getBalance());
	}

	@Test
	public void testWithdrawInsufficientFunds() {
		assertThrows(IllegalArgumentException.class, () -> {
			program.withdraw(1100);
		});
	}
}
