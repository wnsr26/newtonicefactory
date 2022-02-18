package nvc.it.newtonice.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("Event")
@Getter @Setter @NoArgsConstructor
public class Event {
    @Id
    private String _id;
    private String name;
    private String location;

    private List<Event> events = new ArrayList<Event>();

    @CreatedDate
    private Date createdAt;
    
}
