package oops_practice.scenario_based;
import java.util.*;

class HistoryNode {
	String url;
	HistoryNode prev;
	HistoryNode next;
	HistoryNode(String url) {
		this.url = url;
		this.prev = null;
		this.next = null;
	}
}

class BrowserTab {
	HistoryNode head;
	HistoryNode tail;
	HistoryNode current;
	
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);
		if(head == null) {
			head = tail = current = newNode;
		}
		else {
			if(current.next != null) {
				current.next.prev = null;
				current.next = null;
				tail = current;
			}
			
			current.next = newNode;
			newNode.prev = current;
			tail = newNode;
			current = newNode;
		}
		System.out.println("Visited " + url);
	}
	
	public void back() {
		if(current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Page: " + current.url);
			return;
		}
		System.out.println("No previous page");
	}
	
	public void forward() {
		if(current != null && current.next != null) {
			current = current.next;
			System.out.println("Page: " + current.url);
			return;
		}
		System.out.println("No next page");
	}
	
	public void displayCurrentPage() {
		System.out.println(current != null ? current.url : "Empty");
	}
}

public class BrowserBuddy {

	static Stack<BrowserTab> closed = new Stack<BrowserTab>();
	static BrowserTab currentTab = new BrowserTab();
	
	public static void closeTab() {
		closed.push(currentTab);
		currentTab = new BrowserTab();
		System.out.println("Tab closed");
	}
	
	public static void restoreTab() {
		if(!closed.isEmpty()) {
			currentTab = closed.pop();
			System.out.println("Current Tab: ");
			currentTab.displayCurrentPage();
		}
		else {
			System.out.println("No tabs closed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currentTab.visit("google");
		currentTab.visit("youTube");
		currentTab.visit("leetcode");
		
		currentTab.back();
		currentTab.forward();
		currentTab.back();
		currentTab.visit("github");
		closeTab();
		restoreTab();
	}

}
