/**
 * Created by Nikita on 16.02.2016.
 */

public abstract class Chat {

    public Chat(IUser client, ICompany company){

    }

    abstract public boolean trySetMessageFrom(String message);

    //достать последнее сообщение для уведомления
    abstract public String getLastMessage();
}
