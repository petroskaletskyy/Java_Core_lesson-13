/*
 * LOGOS IT ACADEMY
 * */
package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {

	Faction faction;
	ArrayList<Faction> factions = new ArrayList<Faction>();

// 1 - Add new faction	
	public void addFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();
		boolean isCreated = false;

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				isCreated = true;
			}
		}

		if (isCreated == false) {
			factions.add(new Faction(str));
		} else {
			System.out.println("���� ������� ��� ����");
		}

	}

// 2 - Delete faction
	public void deleteFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				iterator.remove();
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}

//3 - Print all faction
	public void printAllFaction() {
		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();
			System.out.println(next.toString());
		}
	}

//5 - Print entered faction
	public void printEnteredFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				System.out.println(next.toStringAllDeputy());
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}
	
//5 - Clean entered faction
	public void deleteAllDeputyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.deleteAllDeputy();
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}	

//6 - Add deputy to entered faction
	public void addDeputyToFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.addDeputy();
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}

//7 - Delete deputy
	public void deleteDeputyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.deleteDeputy();
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}

//8 - Print all bribe taker in faction
	public void printAllBriberInFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.printAllBriber();
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}

//9 - Print main bribe taker in faction
	public void printMainBriberInFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.printMostBriberTaker();
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}

//6 - Print all deputy in faction	
	public void printAllDeputyInFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String str = scanner.nextLine();

		Iterator<Faction> iterator = factions.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.printAllDeputy();
				break;
			} else {
				System.out.println("�����, �� ���� ������� ����");
			}
		}
	}

	@Override
	public String toString() {
		return "�������� ����= " + faction + "]";
	}

}
