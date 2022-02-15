package serverChat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class userList {
	private HashMap<String, gameUser> userNamesAll;
	private ArrayList<String> bigu = new ArrayList<String>();
	public static String userList = "userList-";

	public userList() {
		userNamesAll = gameServer.getUser();

		Iterator<String> keys = userNamesAll.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();

			if (!bigu.contains(key) || bigu == null) {
				bigu.add(key);
				userList = userList + key + "-";

			}
		}
		bigu.clear();

	}

}
