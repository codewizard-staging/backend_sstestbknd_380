package com.app.sstestbknd.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.sstestbknd.model.Manager;
import com.app.sstestbknd.model.Pet;
import com.app.sstestbknd.model.PetCareCenter;
import com.app.sstestbknd.model.PetOwner;
import com.app.sstestbknd.model.Document;
import com.app.sstestbknd.model.PetService;
import com.app.sstestbknd.enums.PetServiceType;
import com.app.sstestbknd.converter.PetServiceTypeConverter;
import com.app.sstestbknd.converter.DurationConverter;
import com.app.sstestbknd.converter.UUIDToByteConverter;
import com.app.sstestbknd.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Document")
@Table(name = "\"Document\"", schema =  "\"sstestbknd_654\"")
@Data
                        
public class Document {
	public Document () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"DocId\"", nullable = true )
  private Integer docId;
	  
  @Column(name = "\"DocName\"", nullable = true )
  private String docName;
  
	  
  @Column(name = "\"FileName\"", nullable = true )
  private String fileName;
  
	  
  @Column(name = "\"FileType\"", nullable = true )
  private String fileType;
  
	  
  @Column(name = "\"FileDescription\"", nullable = true )
  private String fileDescription;
  
  @Column(name = "\"Content\"")
  @EdmMediaStream(contentTypeAttribute = "docFileType")
  private byte[] content;
  
  @Column(name = "\"DocFileType\"")
  private String docFileType;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Document [" 
  + "DocId= " + docId  + ", " 
  + "DocName= " + docName  + ", " 
  + "FileName= " + fileName  + ", " 
  + "FileType= " + fileType  + ", " 
  + "FileDescription= " + fileDescription 
 + "]";
	}
	
}
