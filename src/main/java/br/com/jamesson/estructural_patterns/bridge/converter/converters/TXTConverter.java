package br.com.jamesson.estructural_patterns.bridge.converter.converters;

import br.com.jamesson.estructural_patterns.bridge.converter.employees.Employee;

public class TXTConverter implements Converter {

    @Override
    public String getEmployeeFormated(Employee emp) {
        StringBuilder texto = new StringBuilder();
        texto.append("=====");
        texto.append(emp.getName());
        texto.append("=====");
        texto.append(emp.getSalary());

        return texto.toString();
    }
    
}
