package br.com.jamesson.behavioral_patterns.command.migration;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.jamesson.behavioral_patterns.command.migration.commands.ProductTable;
import br.com.jamesson.behavioral_patterns.command.migration.commands.UserTable;
import br.com.jamesson.behavioral_patterns.command.migration.commands.UserTableRoleColumn;

public class Client {

	public static void main(String[] args) {
		Map<String, List<String>> database = new LinkedHashMap<String, List<String>>();
		MigrationTool tool = new MigrationTool();
		tool.addMigration(new UserTable(database));
		tool.addMigration(new ProductTable(database));
		tool.addMigration(new UserTableRoleColumn(database));
		
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.latest();
		System.out.println(database);
		
		tool.roolback();
		System.out.println(database);
		
	}
}
