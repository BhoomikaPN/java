class ChatShop{
 static String shopName="ChatShop";
 static String chatNames[]={null,null,null,null,null,null,null};
 static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0};
 static int index;
 static int ind;
 
 
 
 public static boolean createChatName(String chatName){
 
 //System.out.println("create chatName is started");
 boolean isChatNameCreated=false;;
 if(chatName!=null){
	chatNames[index]=chatName;
	index++;
	isChatNameCreated=true;
	}
	else{
	System.out.println("chatname cannot be null");
	}
	//System.out.println("create chatName is ended");
	return isChatNameCreated;
 }

public static boolean chatPrice(double price){
	//System.out.println("create chatName is started");
	
	boolean ischatprice=false;
	if(price>0.0){
		chatPrices[ind]=price;
		ischatprice=true;
		ind++;
	}
	else{
		System.out.println("inavalid chat price");
	}
return ischatprice;	
}

public static void getChatName(){

    for(String chat:chatNames){
		System.out.println(chat);
		}
	}
	
	public static boolean updateChatName(String oldChatName, String newChatName){
		    boolean isChatNameUpdated=false;
		System.out.println("chatName updating is started");
		for(int j=0;j<chatNames.length;j++){
			if(oldChatName==chatNames[j]){
				chatNames[j]=newChatName;
				isChatNameUpdated=true;
				System.out.println("chatName updating is ended");
			}
		}
		if(is
		
		
		return isChatNameUpdated;
		
	}
	
	
	
	
}