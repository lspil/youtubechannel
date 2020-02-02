package enitities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class GeneralEntity {

    @Column(name = "date_created")
    protected LocalDateTime dateCreated;

    @Column(name = "last_modified")
    protected LocalDateTime lastModified;

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    @PrePersist
    public void prePersist() {
        this.dateCreated = LocalDateTime.now();
        this.lastModified = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.lastModified = LocalDateTime.now();
    }

}
