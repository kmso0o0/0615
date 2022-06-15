package org.project.controller;

import java.util.Scanner;

import org.project.command.ActionDelete;
import org.project.command.ActionInsert;
import org.project.command.ActionSelect;
import org.project.command.ActionUpdate;

public class ActionController {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("�������� �Է��ϼ��� (insert, select, update, delete)");
			String query = scn.next();
			
			if (query.equals("insert")) {
				ActionInsert insert=new ActionInsert();
				insert.insertQuery();
			} else if(query.equals("select")) {
				ActionSelect select=new ActionSelect();
				select.selectQuery();
			} else if(query.equals("update")) {
				ActionUpdate update=new ActionUpdate();
				update.updateQuery();
			} else if(query.equals("delete")) {
				ActionDelete delete=new ActionDelete();
				delete.deleteQuery();
			} else if(query.equals("exit")) {
				System.out.println("����");
				break;
			} else {
				System.out.println("�ٽ� �Է� �ϼ���");
			}
 			
			
			
			
		}
		scn.close();
	}
}
