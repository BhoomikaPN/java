class ChatShopRunner{

public static void  main(String chats[]){
	
boolean chat = ChatShop.createChatName("bel puri");
boolean price=ChatShop.chatPrice(40.00);
//System.out.println("chatname is added");
chat = ChatShop.createChatName("paper puri");
price=ChatShop.chatPrice(40.00);
//System.out.println("chatname is added");
chat = ChatShop.createChatName("masala puri");
price=ChatShop.chatPrice(40.00);
//System.out.println("chatname is added");
chat = ChatShop.createChatName("dahi puri");
price=ChatShop.chatPrice(40.00);
//System.out.println("chatname is added");
chat = ChatShop.createChatName("biscut puri");
price=ChatShop.chatPrice(40.00);
//System.out.println("chatname is added");
chat = ChatShop.createChatName("chai puri");
price=ChatShop.chatPrice(40.00);
//System.out.println("chatname is added");
chat = ChatShop.createChatName("dhaniya puri");
price=ChatShop.chatPrice(40.00);
System.out.println("chatname is added");
	ChatShop.getChatName();
	
	ChatShop.updateChatName("dhaniya puri","samosa");
	ChatShop.getChatName();
	}
}