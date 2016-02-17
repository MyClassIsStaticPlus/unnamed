import javafx.util.Pair;

import javax.swing.text.IconView;
import java.util.List;

/**
 * company interface
 */

interface ICompany {

    //region company homepage

    //название компании
    String getName();

    void setName(String name);

    //иконка компаниии
    IconView getIcon();

    void setIcon(IconView icon);

    //область работы компании
    WorkFields getFieldOfWork();

    void setFieldOfWork(WorkFields field);

    //описание компании
    String getDescription();

    void setDescription(String description);

    //ссылки компании
    List<String> getLinks();

    void setLink(String link);

    //акции компании
    List<String> getShares();

    void setShare(String name, String description, double percentage, int days);

    //рейтинг компании
    double getRating();

    //менеджеры компании
    List<IManager> getWorkers();

    ICompany setWorker(IAdmin admin, IManager worker);

    ICompany deleteWorker(IAdmin admin, IManager worker);

    //кто может писать сообщения
    ClientType getPrivacyLevel();

    ICompany setPrivacyLevel(ClientType messageSecurityLevel);

    //написание отзыва
    List<String> getReviews();

    ICompany setReview(String review);

    //партнеры компании
    List<Pair<String, ICompany>> getPartners();

    ICompany setPartner(Pair<String, ICompany> partner);

    //endregion;
}