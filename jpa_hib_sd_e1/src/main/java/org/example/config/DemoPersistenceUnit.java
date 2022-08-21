package org.example.config;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.SharedCacheMode;
import jakarta.persistence.ValidationMode;
import jakarta.persistence.spi.ClassTransformer;
import jakarta.persistence.spi.PersistenceUnitInfo;
import jakarta.persistence.spi.PersistenceUnitTransactionType;

import javax.sql.DataSource;
import java.net.URL;
import java.util.List;
import java.util.Properties;

public class DemoPersistenceUnit implements PersistenceUnitInfo {

  public String getPersistenceUnitName() {
    return "DemoPersistenceUnit";
  }

  public String getPersistenceProviderClassName() {
    return "org.hibernate.jpa.HibernatePersistenceProvider";
  }

  public PersistenceUnitTransactionType getTransactionType() {
    return PersistenceUnitTransactionType.RESOURCE_LOCAL;
  }

  public DataSource getJtaDataSource() {
    return null;
  }

  public DataSource getNonJtaDataSource() {
    HikariDataSource dataSource = new HikariDataSource();
    dataSource.setJdbcUrl("jdbc:mysql://localhost/demo");
    dataSource.setUsername("root");
    dataSource.setPassword("");
    return dataSource;
  }

  public List<String> getMappingFileNames() {
    return null;
  }

  public List<URL> getJarFileUrls() {
    return null;
  }

  public URL getPersistenceUnitRootUrl() {
    return null;
  }

  public List<String> getManagedClassNames() {
    return List.of("org.example.entities.Product"); // use reflection to get names
  }

  public boolean excludeUnlistedClasses() {
    return false;
  }

  public SharedCacheMode getSharedCacheMode() {
    return null;
  }

  public ValidationMode getValidationMode() {
    return null;
  }

  public Properties getProperties() {
    return null;
  }

  public String getPersistenceXMLSchemaVersion() {
    return null;
  }

  public ClassLoader getClassLoader() {
    return null;
  }

  public void addTransformer(ClassTransformer classTransformer) {

  }

  public ClassLoader getNewTempClassLoader() {
    return null;
  }
}
