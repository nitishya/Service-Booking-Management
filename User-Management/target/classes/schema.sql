/*
 * id;
	private String name;
	private String password;
	private Long mobile;
	private String mailId;
	private Date redgDate;
 */
create table AppUser (id int Auto_increment, name varchar(255), password varchar(255),mobile int,mail_Id varchar(255),redg_Date Date);
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;
