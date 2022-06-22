package phase2_JUNIT_Package;

import static org.junit.jupiter.api.Assumptions.*;

import java.lang.annotation.ElementType;
import java.time.Month;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class phase2_JUNIT004 {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	public void atestValue(int num) {
		assertTrue(num < 10);
		System.out.println(num);
		System.out.println("-------------------------");
	}

	@ParameterizedTest
	@CsvSource(delimiter = '|', value = { "'name' | 'city'", "'Jordan' | 'SG'" })
	public void btestCSV(String a, String b) {
		System.out.println(a + " - " + b);
		System.out.println("-------------------------");
	}

	@ParameterizedTest
	@EnumSource(Month.class)
	public void ctestEnum(Month month) {
		System.out.println(month.getValue());
		System.out.println("-------------------------");
	}

	@ParameterizedTest
	@EnumSource(value = ElementType.class)
	public void dtestEnum(ElementType e) {
		System.out.println(e.name());
		System.out.println("-------------------------");
	}

	@ParameterizedTest
	@MethodSource("Rmethod")
	public void eMethodS(String str) {
		System.out.println(str);
		System.out.println("-------------------------");
	}

	static Stream<String> Rmethod() {
		return Stream.of("X", "Y","Jordan");
	}
}
