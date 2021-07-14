package entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "event")
public class Event {

	@Id
//	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDHexGenerator",
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator",
	parameters = @Parameter(name="separator", value="="))
	@GeneratedValue(generator = "uuid")
//	private String id;
	private UUID id;
	
	private String description;
	
//	public Event() {
//		this.id = UUID.randomUUID().toString();
//	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	public String getDescription() {
		return description;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	};
	
}
