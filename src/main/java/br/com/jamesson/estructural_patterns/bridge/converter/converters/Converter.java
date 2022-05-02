package br.com.jamesson.estructural_patterns.bridge.converter.converters;

import br.com.jamesson.estructural_patterns.bridge.converter.employees.Employee;

public interface Converter {
	String getEmployeeFormated(Employee emp);
}
