--------------------------------------------------------
--  File created - Friday-July-24-2020   
--------------------------------------------------------
DROP TABLE "SYSTEM"."NOTICEINFO";
DROP TABLE "SYSTEM"."ADMINSTUDENTRECORD";
DROP TABLE "SYSTEM"."SEMESTER";
DROP TABLE "SYSTEM"."SECTION";
DROP TABLE "SYSTEM"."GUESTDATA";
DROP TABLE "SYSTEM"."COLLEGE_DETAIL";
DROP TABLE "SYSTEM"."EVENTINFO";
DROP TABLE "SYSTEM"."CLUB";
DROP TABLE "SYSTEM"."EVENTIMAGE";
DROP TABLE "SYSTEM"."FEEDBACK";
DROP TABLE "SYSTEM"."ADMINRECORD";
DROP TABLE "SYSTEM"."STUDENTINFO";
DROP TABLE "SYSTEM"."SUBJECTCOURSE";
DROP TABLE "SYSTEM"."VENUE";
DROP TABLE "SYSTEM"."CLUB";
DROP TABLE "SYSTEM"."EVENTIMAGE";
DROP TABLE "SYSTEM"."VENUE";
DROP TABLE "SYSTEM"."SECTION";
DROP TABLE "SYSTEM"."SEMESTER";
DROP TABLE "SYSTEM"."SUBJECTCOURSE";
DROP TABLE "SYSTEM"."ADMINSTUDENTRECORD";
DROP TABLE "SYSTEM"."GUESTDATA";
DROP TABLE "SYSTEM"."COLLEGE_DETAIL";
DROP TABLE "SYSTEM"."EVENTINFO";
DROP TABLE "SYSTEM"."FEEDBACK";
DROP TABLE "SYSTEM"."ADMINRECORD";
DROP TABLE "SYSTEM"."STUDENTINFO";
DROP TABLE "SYSTEM"."NOTICEINFO";
--------------------------------------------------------
--  DDL for Sequence MYSEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."MYSEQ"  MINVALUE 1 MAXVALUE 999999 INCREMENT BY 1 START WITH 241 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table NOTICEINFO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."NOTICEINFO" 
   (	"ID" NUMBER(*,0), 
	"TYPE" VARCHAR2(200 BYTE), 
	"SUBJECT" VARCHAR2(200 BYTE), 
	"DESCRIPTION" VARCHAR2(3500 BYTE), 
	"DATEISSUED" DATE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ADMINSTUDENTRECORD
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ADMINSTUDENTRECORD" 
   (	"UNIID" NUMBER(*,0), 
	"STUDENTNAME" VARCHAR2(50 BYTE), 
	"STATUS" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SEMESTER
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SEMESTER" 
   (	"SEMID" NUMBER(*,0), 
	"SEMESTER" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SECTION
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SECTION" 
   (	"SECTIONID" NUMBER(*,0), 
	"SECTION" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table GUESTDATA
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."GUESTDATA" 
   (	"ID" NUMBER(*,0), 
	"EMAIL" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table COLLEGE_DETAIL
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."COLLEGE_DETAIL" 
   (	"CLZINTRO" VARCHAR2(4000 BYTE), 
	"ABOUTUS" VARCHAR2(4000 BYTE), 
	"CONTACTUS" VARCHAR2(3500 BYTE), 
	"ID" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EVENTINFO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."EVENTINFO" 
   (	"EVENT_ID" NUMBER, 
	"EVENT_NAME" VARCHAR2(200 BYTE), 
	"STARTDATE" DATE, 
	"ENDDATE" DATE, 
	"DESCRIPTION" VARCHAR2(2500 BYTE), 
	"CLUB_FK" NUMBER, 
	"VENUE_FK" NUMBER, 
	"IMAGE_FK" NUMBER
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table CLUB
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."CLUB" 
   (	"CLUBID" NUMBER(*,0), 
	"CLUBNAME" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EVENTIMAGE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."EVENTIMAGE" 
   (	"IMGID" NUMBER(*,0), 
	"IMG1" BLOB, 
	"IMG2" BLOB, 
	"IMG3" BLOB
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" 
 LOB ("IMG1") STORE AS BASICFILE (
  TABLESPACE "SYSTEM" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("IMG2") STORE AS BASICFILE (
  TABLESPACE "SYSTEM" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("IMG3") STORE AS BASICFILE (
  TABLESPACE "SYSTEM" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;
--------------------------------------------------------
--  DDL for Table FEEDBACK
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."FEEDBACK" 
   (	"ID" NUMBER, 
	"SUBJECT" VARCHAR2(200 BYTE), 
	"DESCRIPTION" VARCHAR2(2500 BYTE), 
	"FEED_DATE" DATE DEFAULT sysdate
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ADMINRECORD
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ADMINRECORD" 
   (	"ID" NUMBER(*,0), 
	"ADMINKEY" VARCHAR2(30 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table STUDENTINFO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."STUDENTINFO" 
   (	"CLZID" NUMBER(*,0), 
	"NAME" VARCHAR2(100 BYTE), 
	"EMAIL" VARCHAR2(100 BYTE), 
	"DOB" DATE, 
	"GENDER" VARCHAR2(20 BYTE), 
	"ADD_CITY" VARCHAR2(200 BYTE), 
	"ADD_STATE" VARCHAR2(200 BYTE), 
	"ZIPCODE" VARCHAR2(200 BYTE), 
	"PASSWORD" VARCHAR2(200 BYTE), 
	"COURSEID" NUMBER(*,0), 
	"SEMID" NUMBER(*,0), 
	"SECTIONID" NUMBER(*,0), 
	"PHONE" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SUBJECTCOURSE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SUBJECTCOURSE" 
   (	"COURSEID" NUMBER(*,0), 
	"NAME" VARCHAR2(100 BYTE), 
	"DESCRIPTION" VARCHAR2(3500 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table VENUE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."VENUE" 
   (	"VENUEID" NUMBER(*,0), 
	"VENUENAME" VARCHAR2(200 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table CLUB
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."CLUB" 
   (	"CLUBID" NUMBER(*,0), 
	"CLUBNAME" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EVENTIMAGE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."EVENTIMAGE" 
   (	"IMGID" NUMBER(*,0), 
	"IMG1" BLOB, 
	"IMG2" BLOB, 
	"IMG3" BLOB
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" 
 LOB ("IMG1") STORE AS BASICFILE (
  TABLESPACE "SYSTEM" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("IMG2") STORE AS BASICFILE (
  TABLESPACE "SYSTEM" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("IMG3") STORE AS BASICFILE (
  TABLESPACE "SYSTEM" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;
--------------------------------------------------------
--  DDL for Table VENUE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."VENUE" 
   (	"VENUEID" NUMBER(*,0), 
	"VENUENAME" VARCHAR2(200 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SECTION
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SECTION" 
   (	"SECTIONID" NUMBER(*,0), 
	"SECTION" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SEMESTER
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SEMESTER" 
   (	"SEMID" NUMBER(*,0), 
	"SEMESTER" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SUBJECTCOURSE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SUBJECTCOURSE" 
   (	"COURSEID" NUMBER(*,0), 
	"NAME" VARCHAR2(100 BYTE), 
	"DESCRIPTION" VARCHAR2(3500 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ADMINSTUDENTRECORD
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ADMINSTUDENTRECORD" 
   (	"UNIID" NUMBER(*,0), 
	"STUDENTNAME" VARCHAR2(50 BYTE), 
	"STATUS" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table GUESTDATA
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."GUESTDATA" 
   (	"ID" NUMBER(*,0), 
	"EMAIL" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table COLLEGE_DETAIL
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."COLLEGE_DETAIL" 
   (	"CLZINTRO" VARCHAR2(4000 BYTE), 
	"ABOUTUS" VARCHAR2(4000 BYTE), 
	"CONTACTUS" VARCHAR2(3500 BYTE), 
	"ID" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EVENTINFO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."EVENTINFO" 
   (	"EVENT_ID" NUMBER, 
	"EVENT_NAME" VARCHAR2(200 BYTE), 
	"STARTDATE" DATE, 
	"ENDDATE" DATE, 
	"DESCRIPTION" VARCHAR2(2500 BYTE), 
	"CLUB_FK" NUMBER, 
	"VENUE_FK" NUMBER, 
	"IMAGE_FK" NUMBER
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table FEEDBACK
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."FEEDBACK" 
   (	"ID" NUMBER, 
	"SUBJECT" VARCHAR2(200 BYTE), 
	"DESCRIPTION" VARCHAR2(2500 BYTE), 
	"FEED_DATE" DATE DEFAULT sysdate
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ADMINRECORD
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ADMINRECORD" 
   (	"ID" NUMBER(*,0), 
	"ADMINKEY" VARCHAR2(30 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table STUDENTINFO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."STUDENTINFO" 
   (	"CLZID" NUMBER(*,0), 
	"NAME" VARCHAR2(100 BYTE), 
	"EMAIL" VARCHAR2(100 BYTE), 
	"DOB" DATE, 
	"GENDER" VARCHAR2(20 BYTE), 
	"ADD_CITY" VARCHAR2(200 BYTE), 
	"ADD_STATE" VARCHAR2(200 BYTE), 
	"ZIPCODE" VARCHAR2(200 BYTE), 
	"PASSWORD" VARCHAR2(200 BYTE), 
	"COURSEID" NUMBER(*,0), 
	"SEMID" NUMBER(*,0), 
	"SECTIONID" NUMBER(*,0), 
	"PHONE" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table NOTICEINFO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."NOTICEINFO" 
   (	"ID" NUMBER(*,0), 
	"TYPE" VARCHAR2(200 BYTE), 
	"SUBJECT" VARCHAR2(200 BYTE), 
	"DESCRIPTION" VARCHAR2(3500 BYTE), 
	"DATEISSUED" DATE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.NOTICEINFO
SET DEFINE OFF;
Insert into SYSTEM.NOTICEINFO (ID,TYPE,SUBJECT,DESCRIPTION,DATEISSUED) values (181,'ceremony','farewell program','this is to notify student about a farewell program at Bhaktapur.All the student are invited to the programm. See you soon',to_date('20-JUL-18','DD-MON-RR'));
Insert into SYSTEM.NOTICEINFO (ID,TYPE,SUBJECT,DESCRIPTION,DATEISSUED) values (203,'Sports','Annual Sports Week','Sports Week Notice



This notice is for the sports week which is going to be held from 7-16 April 2019.

The planned games are:

Futsal:

April 7, 2019 Futsal Tournament- 2 Matches – Time: 11am – 1pm

April 9, 2019- 2 matches – Time: 12pm-2pm

April 11, 2019- 1 match (Final) – Time: 12pm-2pm

April 11, 2019- Women’s futsal.

Table Tennis:

Wednesday 10, 2019 – QF and SF – Time: 12pm-3pm

Friday 12, 2019- Finals – Time: 12pm-3pm

Basketball:

Tuesday 16, 2019- SF and Finals– Time: 12pm-3pm

For all the inquiry, registration and confirmation please contact Rashim Joshi 9808849146, 9843969555. Please call him from 12-5pm.

Email: rashim.joshi@study.beds.ac.uk

If you are unable to contact Rashim please contact Mr. Saurav Satyal Room A105B Ground Floor.

Note: Badminton and Cricket are under planning and a notice will be issued soon',to_date('03-JAN-20','DD-MON-RR'));
Insert into SYSTEM.NOTICEINFO (ID,TYPE,SUBJECT,DESCRIPTION,DATEISSUED) values (204,'Guest Lecture','Guest Lecture – AI and Emerging Technologies','Please note that the Guest Lecture on AI and Emerging Technologies is scheduled on 22nd November 2018 (Thursday) at 9:00 am to 10:00 am.



The Speaker for the session is Mr.Nirmal Adhikari from Build Change (INGO).



It is mandatory for everyone to attend the session.',to_date('03-JUL-20','DD-MON-RR'));
Insert into SYSTEM.NOTICEINFO (ID,TYPE,SUBJECT,DESCRIPTION,DATEISSUED) values (205,' ExaminationInternal','Internal Exams –BBA','Please find attached here the date sheet of internal examinations to be commenced from September 9, 2018

BBA EXAMINATION
S.NO	DATE	TIME	SUBJECT
BBA LEVEL 4 (FOUNDATION)
1	9/09/2018	9: 00 am to 11:00 am	Basic Mathematics
2	10/09/2018	9: 00 am to 11:00 am	Fundamentals of Computers
3	11/09/2018	9: 00 am to 11:00 am	————————–
4	13/09/2018	9: 00 am to 11:00 am	Business Studies
BBA LEVEL 5 BRIDGE
1	9/09/2018	9: 00 am to 11:00 am	Research Methodology
2	10/09/2018	9: 00 am to 11:00 am	—————————–
3	11/09/2018	9: 00 am to 11:00 am	—————————–
4	13/09/2018	9: 00 am to 11:00 am	Academic English
You are hereby requested to report 15 minutes prior to the exam commencement of examinations and don’t bring mobile phones, bag in the examination room, however you are allowed to bring sufficient stationary articles along with your ID cards.',to_date('03-FEB-20','DD-MON-RR'));
Insert into SYSTEM.NOTICEINFO (ID,TYPE,SUBJECT,DESCRIPTION,DATEISSUED) values (206,'Programming event','codathon','its a three days event organised by the group of level6 students. all the intrested student can participate the event. please refer to noticeboard for more info.',to_date('22-JUL-20','DD-MON-RR'));
REM INSERTING into SYSTEM.ADMINSTUDENTRECORD
SET DEFINE OFF;
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1816275,'Santosh','Taken');
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1819621,'Dilip Raimajhi','Taken');
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1816253,'Santosh Pulami Magar','Taken');
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1817583,'Hari Bahadur','Taken');
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1817584,'Madan Bahadur','Taken');
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1816212,'SUbash Moktan','Taken');
Insert into SYSTEM.ADMINSTUDENTRECORD (UNIID,STUDENTNAME,STATUS) values (1816215,'Prabesh Rai','Taken');
REM INSERTING into SYSTEM.SEMESTER
SET DEFINE OFF;
Insert into SYSTEM.SEMESTER (SEMID,SEMESTER) values (1,'L4S1');
Insert into SYSTEM.SEMESTER (SEMID,SEMESTER) values (2,'L4S2');
Insert into SYSTEM.SEMESTER (SEMID,SEMESTER) values (3,'L5S1');
Insert into SYSTEM.SEMESTER (SEMID,SEMESTER) values (4,'L5S2');
Insert into SYSTEM.SEMESTER (SEMID,SEMESTER) values (5,'L6S1');
Insert into SYSTEM.SEMESTER (SEMID,SEMESTER) values (6,'L6S2');
REM INSERTING into SYSTEM.SECTION
SET DEFINE OFF;
Insert into SYSTEM.SECTION (SECTIONID,SECTION) values (1,'Section A');
Insert into SYSTEM.SECTION (SECTIONID,SECTION) values (2,'Section B');
REM INSERTING into SYSTEM.GUESTDATA
SET DEFINE OFF;
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (24,'huntervsskull@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (27,'hari@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (81,'1233@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (103,'huntervskkul@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (141,'hunter@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (161,'hunt@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (177,'l@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (182,'hunter@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (209,'h@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (210,'h@gmail.com');
Insert into SYSTEM.GUESTDATA (ID,EMAIL) values (220,'j@gamil.com');
REM INSERTING into SYSTEM.COLLEGE_DETAIL
SET DEFINE OFF;
Insert into SYSTEM.COLLEGE_DETAIL (CLZINTRO,ABOUTUS,CONTACTUS,ID) values ('Patan College for Professional Studies (PCPS) is a constituent member of LBEF Group of Institutions (Lord Buddha Education Foundation). LBEF has a long standing history in the field of education and academics in Nepal, being established in 1998 as the first IT College in Nepal. More than 7000 students have over the years graduated from LBEF Group of Institutions and today, have established their career as bankers, IT experts, entrepreneurs, managers, leaders in their chosen area of work. 
ABOUT OUR JOURNEY
The inception of Patan College (PCPS) began with a simple thought of social cause of providing an exposure to a globally accredited degree from a renowned United Kingdom (UK) based university to all Nepal and neighbourhood citizens. This initial thought was put into motion by launching an exhaustive research on UK based Universities and our sincere efforts led us on to the University of Bedfordshire (UoB), with over a hundred years of experience as a quality education provider in the UK. PCPS is, now, one of the among other educational institutions in Nepal who offer and deliver UK degrees for various undergraduate and graduate level courses. More than a Degree
Studying at the Patan College for Professional Studies is about so much more than just getting a degree.

We offer you a nurturing and supportive environment to help you become an educated, employable and entrepreneurial global citizen.

By engaging in the opportunities which we offer, you can not only shape your own future, but also that of the college and university.','TOTAL BUILDING AREA
The academic complex spread over an area of 10952 square feet includes the College building, the basketball court and the parking lot. PCPS has provided state-of-the-art facilities in the College building to ensure premium services are in place for students enrolling into the academic programmes that are delivered. 

CLASSROOMS
The lecture rooms are spacious, airy, well illuminated and designed to accommodate 30 students in comfortable furniture settings with dedicated internet connectivity and provisions for power-point presentations. LABS
There are two computer laboratories, set up to meet the requirements of the Computer Science and Software Engineering course, one specific for mobile application development.

 TUTORIAL ROOM
The tutorial rooms are smaller sized versions of the lecture rooms to facilitate student-module leader interaction on a one-to-one basis or in smaller groups. 

LEARNING AREA
The student learning hub is designed to provide the students space for their leisurely activities within the College hours. This is the room to go to and sit down over a cup of tea or coffee and work independently or in small groups during the independent activity or assignments. PROJECT AREA
Apart from the full-fledged laboratories, there are smaller sized project rooms equipped with the necessities for students planning and working on group projects.

 LIBRARY
The library is situated at the fifth level and comprises of the digital section housing the online resources in addition to the borrowing and reference section. Ample space with tables, chair are in place for students wanting to work within the library itself.

 AUDIO VISUAL ROOM
The audio-video presentation room is equipped with the provisions for recording and playback of practice sessions of presentations so as to provide students with insights into improving one’s delivery, diction and content before the actual presentation in the classrooms. 

GD ROOMS
The group discussion rooms in each floor provides the space for the planning, discussion and implementation phase of group projects, assignments and their close proximity to the faculty rooms ensures that faculty supervision and guidance is at hand whenever required.','
CONTACT US
Kandevtasthan,
Lalitpur,
Nepal
+977 1 5181033
+977 1 5181198
connect@patancollege.org

',1);
REM INSERTING into SYSTEM.EVENTINFO
SET DEFINE OFF;
Insert into SYSTEM.EVENTINFO (EVENT_ID,EVENT_NAME,STARTDATE,ENDDATE,DESCRIPTION,CLUB_FK,VENUE_FK,IMAGE_FK) values (211,'Saraswoti Pooja',to_date('03-OCT-12','DD-MON-RR'),to_date('03-OCT-12','DD-MON-RR'),'Vasant Panchami also spelled Basant Panchami, is a festival that marks the preparation for the arrival of spring. The festival is celebrated by people in various ways depending upon the region in the life in the Indian subcontinent. Vasant Panchami also marks the start of preparation for Holika and Holi, which take place forty days later.[5] The Vasant Utsava (festival) on Panchami is celebrated forty days before Spring, because any seasons transition period is 40 days, and after that, the season comes into full bloom.',2,3,1);
Insert into SYSTEM.EVENTINFO (EVENT_ID,EVENT_NAME,STARTDATE,ENDDATE,DESCRIPTION,CLUB_FK,VENUE_FK,IMAGE_FK) values (221,'laxmi pooja',to_date('07-JUL-20','DD-MON-RR'),to_date('07-JUL-20','DD-MON-RR'),'on the occasion of deepawali laxi puja is organised in college premises.',3,1,1);
Insert into SYSTEM.EVENTINFO (EVENT_ID,EVENT_NAME,STARTDATE,ENDDATE,DESCRIPTION,CLUB_FK,VENUE_FK,IMAGE_FK) values (218,'gaming compition',to_date('13-JUL-20','DD-MON-RR'),to_date('13-JUL-20','DD-MON-RR'),'its a pubg gaming compition .',1,3,1);
Insert into SYSTEM.EVENTINFO (EVENT_ID,EVENT_NAME,STARTDATE,ENDDATE,DESCRIPTION,CLUB_FK,VENUE_FK,IMAGE_FK) values (212,'Holi',to_date('04-OCT-12','DD-MON-RR'),to_date('04-OCT-12','DD-MON-RR'),'Holi 2019 Date in India Calendar:  Celebrated by Hindus every year, on the day of Purnima (the full moon), in the month of Falgun over two consecutive days — the first day of Holi is known as Chhoti Holi or Holika Dahan and the second as Rangwali Holi, Dhuleti, Dhulandi or Dhulivandan. This year, the festival of colours will be celebrated on March 20 and 21.',1,3,1);
Insert into SYSTEM.EVENTINFO (EVENT_ID,EVENT_NAME,STARTDATE,ENDDATE,DESCRIPTION,CLUB_FK,VENUE_FK,IMAGE_FK) values (213,'Codathon',to_date('04-OCT-12','DD-MON-RR'),to_date('04-OCT-12','DD-MON-RR'),'Codathon befittingly marks the beginning of our Annual Students conclave Chimera. Conducted by ISTE Students Chapter MANIT, CODATHON 20 is the annual Inter-NIT coding contest packed with challenges that put to test every problem-solving skill of students.

The prospect of coming across seven questions, each more mentally draining than the other is what any student with a desire to learn or master the art of competitive programming craves for.

Participation is open to all those who relish a week-long algorithmic tussle.

All the talented and lucky winners will be awarded by ISTE SC MANIT with many exciting goodies and/or prize money, which will be electronically transferred after the successful verification of Bonafide certificate from their respective institutes',1,3,1);
Insert into SYSTEM.EVENTINFO (EVENT_ID,EVENT_NAME,STARTDATE,ENDDATE,DESCRIPTION,CLUB_FK,VENUE_FK,IMAGE_FK) values (214,'Social-Work event',to_date('04-OCT-12','DD-MON-RR'),to_date('04-OCT-12','DD-MON-RR'),' We have award programs to honor the highest social work achievements and to showcase excellence. We also sponsor celebrations and campaigns to help educate the public about the impact social workers make on institutions and policies that help millions of people achieve better lives.',3,3,1);
REM INSERTING into SYSTEM.CLUB
SET DEFINE OFF;
Insert into SYSTEM.CLUB (CLUBID,CLUBNAME) values (1,'IT club');
Insert into SYSTEM.CLUB (CLUBID,CLUBNAME) values (2,'Sports Club');
Insert into SYSTEM.CLUB (CLUBID,CLUBNAME) values (3,'Socio-Cultural Club');
Insert into SYSTEM.CLUB (CLUBID,CLUBNAME) values (4,'Free-Flow Club');
Insert into SYSTEM.CLUB (CLUBID,CLUBNAME) values (5,'others');
REM INSERTING into SYSTEM.EVENTIMAGE
SET DEFINE OFF;
Insert into SYSTEM.EVENTIMAGE (IMGID) values (1);
REM INSERTING into SYSTEM.FEEDBACK
SET DEFINE OFF;
Insert into SYSTEM.FEEDBACK (ID,SUBJECT,DESCRIPTION,FEED_DATE) values (201,'College Lab','The lab facilities of the college is very good. However the internet facilities is not proper . hope you will try to improve the internet facilities',to_date('03-JUL-20','DD-MON-RR'));
Insert into SYSTEM.FEEDBACK (ID,SUBJECT,DESCRIPTION,FEED_DATE) values (202,'SPorts activities','Even though the college has basketballcourt there is no sufficiant basketball. Hence we cannot use basketball court to play the games and maintain physical activities.',to_date('03-JUN-20','DD-MON-RR'));
REM INSERTING into SYSTEM.ADMINRECORD
SET DEFINE OFF;
Insert into SYSTEM.ADMINRECORD (ID,ADMINKEY) values (1,'admin123');
REM INSERTING into SYSTEM.STUDENTINFO
SET DEFINE OFF;
Insert into SYSTEM.STUDENTINFO (CLZID,NAME,EMAIL,DOB,GENDER,ADD_CITY,ADD_STATE,ZIPCODE,PASSWORD,COURSEID,SEMID,SECTIONID,PHONE) values (1162456398,'asda','asd@gmail.com',to_date('02-JUL-20','DD-MON-RR'),'Male',null,null,null,'Sub@shh9841',1,1,1,null);
Insert into SYSTEM.STUDENTINFO (CLZID,NAME,EMAIL,DOB,GENDER,ADD_CITY,ADD_STATE,ZIPCODE,PASSWORD,COURSEID,SEMID,SECTIONID,PHONE) values (1816212456,'Prabesh Rai','rai@gmail.com',to_date('12-JUL-00','DD-MON-RR'),'Male','Harishi','Lalitpur','152400','subash',2,2,2,'9856425478');
Insert into SYSTEM.STUDENTINFO (CLZID,NAME,EMAIL,DOB,GENDER,ADD_CITY,ADD_STATE,ZIPCODE,PASSWORD,COURSEID,SEMID,SECTIONID,PHONE) values (1816541231,'Santosh Magar','santosh@gmail.com',to_date('17-JUL-01','DD-MON-RR'),'Male','Kapurdhara','Kathmandu','78451','Sub@shh9870',2,3,2,'9865748123');
Insert into SYSTEM.STUDENTINFO (CLZID,NAME,EMAIL,DOB,GENDER,ADD_CITY,ADD_STATE,ZIPCODE,PASSWORD,COURSEID,SEMID,SECTIONID,PHONE) values (1816245632,'Dilip','dilip@gmail.com',to_date('22-JUL-26','DD-MON-RR'),'Male','asd','dasd','asd','subash',1,2,2,'9865457708');
Insert into SYSTEM.STUDENTINFO (CLZID,NAME,EMAIL,DOB,GENDER,ADD_CITY,ADD_STATE,ZIPCODE,PASSWORD,COURSEID,SEMID,SECTIONID,PHONE) values (1816212628,'asd','s@gmail.com',to_date('14-JUL-20','DD-MON-RR'),'Male',null,null,null,'Sub@shh9841',1,1,1,null);
Insert into SYSTEM.STUDENTINFO (CLZID,NAME,EMAIL,DOB,GENDER,ADD_CITY,ADD_STATE,ZIPCODE,PASSWORD,COURSEID,SEMID,SECTIONID,PHONE) values (1816583691,'Madan Bahadur','Madan@gmail.com',to_date('17-JUL-00','DD-MON-RR'),'Male','as','as','as','subash',1,1,1,'9865457708');
REM INSERTING into SYSTEM.SUBJECTCOURSE
SET DEFINE OFF;
Insert into SYSTEM.SUBJECTCOURSE (COURSEID,NAME,DESCRIPTION) values (1,'BBA','ABOUT COURSE
BBA Business Administration is targeted towards achieving both practical skills and conceptual understanding required for administration and management functions within a host of organizations. It provides a broad understanding of the role and function of both management and administration under a range of operating conditions and as such builds for you a contextual and conceptual of the organization as it responds to ever changing conditions. All the basic functional areas that are deemed to comprise the business discipline – Marketing, Operations, Information Systems, Finance, HRM, Business Policy and Strategy and Change, Economics, Law and Contemporary Issues – are examined over the duration of the course and in the context of contemporary change.

The course BBA Business Administration aims to deliver conceptual propositions and skills related to:

a range of business models, ideas and managerial techniques
a number of management theories relevant to different functions of the business
a range of suitable examples and contexts to assist you in operating in different business environments.
the opportunity to expand upon theoretical constructs into the application of knowledge and its practical implications for the business as a going concern.

Why BBA Business Administration?
Class sizes are small that enables one to one attention and peer learning. Teaching pedagogy focuses on multidimensional learning approach through lectures, seminars and workshops, plus group projects, research exercises, presentations and case study analyses.
Learning of essential components of business administration including marketing, financial and management accounting, human resource management, project management, business law, Intercultural Competencies and economics.
Develop an entrepreneurial mindset with help of units focusing on leadership of business ventures, new advances in business that enhances understanding of organization and practical skills to attract new employees, retain or to start a new venture of your own.
The degree not only opens career access in general management roles, it aids in specialist areas of human resources, e-business, global marketing.
This course is a foundation for further academic progression into postgraduate/professional degree.


Distinctive Features
The course has been designed to develop graduates who are able to:

Perform in an organization effectively with an intelligent pro-active mind-set in a project involving people from different functions in the organization
Be able to network purposefully with stakeholders, external and internal and enhance the success of initiatives within the organization.
Show initiative and enterprise in implementing new ideas and technologies in the face of external uncertainty. To have the ability to engage effectively and appropriately, both orally and in writing, with a variety of audiences to analyze a situation to formulate a considered and reflective opinion and to make reasoned and informed recommendations.
Work independently on defined business problems, suggest appropriate courses of action and evaluate contingent outcomes.
Participate in major projects as an effective team member applying specific business skills and techniques creatively.');
Insert into SYSTEM.SUBJECTCOURSE (COURSEID,NAME,DESCRIPTION) values (2,'BscCSSE','ABOUT COURSE
Computer Science 9865457708Ss@ Engineering is at the core of modern technology and at the heart of a number of specialist technology fields. B.Sc Computer Science  Engineering course is aimed at providing a foundation as well as a platform for specialist study in the second and third stages, during which you will learn in depth, the principles and practices of both disciplines computer science and software engineering.

The disciplines of B.Sc Computer Science and Software Engineering are central to many of today’s commercial and industrial activities, as well as providing a diverse and rapidly developing field for personal study. This course is designed to enable you to analyze and build a range of applications. Emphasis is on the entire software development lifecycle, and the production of high-quality software systems using object-oriented (OO) methods and tools. You’ll explore the entire systems development life-cycle, as well as comprehensively covering OO methods.

The final-stage project enables you to take your specialist work to greater depth, leading to the possibility of future research. The emphasis of the course is to provide vocationally skilled programmers and software engineers who have both a general overview of computer science and software engineering, with a more detailed knowledge of fields like internet programming, database applications, artificial intelligence applications or networking.

WHY B.Sc Computer Science and Software Engineering ?
Learn about the entire software development life cycle and the production of high quality systems using object-oriented methods.
Study with committed, like-minded students in dedicated laboratories and classrooms
Develop your professionalism as you choose the career path you wish to take
Gain detailed knowledge of areas such as Internet programming, database applications, artificial intelligence and networking.
Explore the highly sought-after practical skills you will need to make a success of your career
Challenge yourself with a final stage project which will enable you to study your specialism in greater depth
Benefit from teaching by staff who have a strong academic research backgrounds and are also actively engaged in knowledge transfer

Distinctive Features
The course has been designed to develop graduates who are able to:

Broadly based yet enough depth (programming skills, testing skills etc.) so as to give you credible vocational skills in both Computer Science and Software Engineering;
Coverage of the entire Software Engineering life cycle and comprehensive skills in applied programming and in applied Computer science topics;
Taught by staff with both a strong academic research background who’re also actively engaged in knowledge transfer (e.g. to local SME’s), and who are at the forefront of their field;
Emphasis on the life-cycle but also in depth skills such as programming and analysis');
REM INSERTING into SYSTEM.VENUE
SET DEFINE OFF;
Insert into SYSTEM.VENUE (VENUEID,VENUENAME) values (1,'College Ground');
Insert into SYSTEM.VENUE (VENUEID,VENUENAME) values (2,'Seminar Hall');
Insert into SYSTEM.VENUE (VENUEID,VENUENAME) values (3,'College Hall');
--------------------------------------------------------
--  DDL for Index ADMINSTUDENTRECORD_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."ADMINSTUDENTRECORD_PK" ON "SYSTEM"."ADMINSTUDENTRECORD" ("UNIID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SEMESTER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SEMESTER_PK" ON "SYSTEM"."SEMESTER" ("SEMID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SECTION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SECTION_PK" ON "SYSTEM"."SECTION" ("SECTIONID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index GUESTDATA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."GUESTDATA_PK" ON "SYSTEM"."GUESTDATA" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index COLLEGE_DETAIL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."COLLEGE_DETAIL_PK" ON "SYSTEM"."COLLEGE_DETAIL" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index EVENTINFO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."EVENTINFO_PK" ON "SYSTEM"."EVENTINFO" ("EVENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index CLUB_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."CLUB_PK" ON "SYSTEM"."CLUB" ("CLUBID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index EVENTIMG_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."EVENTIMG_PK" ON "SYSTEM"."EVENTIMAGE" ("IMGID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007747
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SYS_C007747" ON "SYSTEM"."FEEDBACK" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index ADMINRECORD_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."ADMINRECORD_PK" ON "SYSTEM"."ADMINRECORD" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index STUDENTINFO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."STUDENTINFO_PK" ON "SYSTEM"."STUDENTINFO" ("CLZID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SUBJECTCOURSE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SUBJECTCOURSE_PK" ON "SYSTEM"."SUBJECTCOURSE" ("COURSEID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index VENUE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."VENUE_PK" ON "SYSTEM"."VENUE" ("VENUEID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Trigger TR_CITY
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR_CITY" before insert on noticeinfo for each row
begin select lpad (ltrim(rtrim(to_char(myseq.nextval))),4,'0') into :New.ID from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR_CITY" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CITY3
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CITY3" before insert on semester for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.semid from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR__CITY3" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CITY4
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CITY4" before insert on section for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.sectionid from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR__CITY4" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CITY2
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CITY2" before insert on guestdata for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.id from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR__CITY2" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CITY12
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CITY12" before insert on eventinfo for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.event_id from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR__CITY12" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CITY1
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CITY1" before insert on club for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.clubid from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR__CITY1" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CIT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CIT" before insert on "EVENTIMAGE" for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.imgid from dual; end;


/
ALTER TRIGGER "SYSTEM"."TR__CIT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR_A
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR_A" before insert on feedback for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.id from dual; end;

/
ALTER TRIGGER "SYSTEM"."TR_A" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TR__CITY
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "SYSTEM"."TR__CITY" before insert on subjectcourse for each row 
begin select lpad(LTRIM(RTRIM(TO_CHAR(MYSEQ.nextval))),5,'0') into:new.courseid from dual; end;
/
ALTER TRIGGER "SYSTEM"."TR__CITY" ENABLE;
--------------------------------------------------------
--  DDL for Synonymn DUAL
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE PUBLIC SYNONYM "DUAL" FOR "SYS"."DUAL";
--------------------------------------------------------
--  Constraints for Table NOTICEINFO
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."NOTICEINFO" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."NOTICEINFO" MODIFY ("TYPE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."NOTICEINFO" MODIFY ("SUBJECT" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."NOTICEINFO" MODIFY ("DESCRIPTION" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ADMINSTUDENTRECORD
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ADMINSTUDENTRECORD" MODIFY ("UNIID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ADMINSTUDENTRECORD" MODIFY ("STUDENTNAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ADMINSTUDENTRECORD" ADD CONSTRAINT "ADMINSTUDENTRECORD_PK" PRIMARY KEY ("UNIID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SEMESTER
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."SEMESTER" MODIFY ("SEMID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SEMESTER" MODIFY ("SEMESTER" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SEMESTER" ADD CONSTRAINT "SEMESTER_PK" PRIMARY KEY ("SEMID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SECTION
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."SECTION" MODIFY ("SECTIONID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SECTION" ADD CONSTRAINT "SECTION_PK" PRIMARY KEY ("SECTIONID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table GUESTDATA
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."GUESTDATA" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."GUESTDATA" MODIFY ("EMAIL" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."GUESTDATA" ADD CONSTRAINT "GUESTDATA_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table COLLEGE_DETAIL
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."COLLEGE_DETAIL" MODIFY ("CLZINTRO" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COLLEGE_DETAIL" MODIFY ("ABOUTUS" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COLLEGE_DETAIL" MODIFY ("CONTACTUS" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COLLEGE_DETAIL" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."COLLEGE_DETAIL" ADD CONSTRAINT "COLLEGE_DETAIL_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table EVENTINFO
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."EVENTINFO" MODIFY ("EVENT_ID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTINFO" MODIFY ("EVENT_NAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTINFO" MODIFY ("STARTDATE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTINFO" MODIFY ("ENDDATE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTINFO" MODIFY ("DESCRIPTION" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTINFO" ADD CONSTRAINT "EVENTINFO_PK" PRIMARY KEY ("EVENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CLUB
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."CLUB" MODIFY ("CLUBID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."CLUB" MODIFY ("CLUBNAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."CLUB" ADD CONSTRAINT "CLUB_PK" PRIMARY KEY ("CLUBID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table EVENTIMAGE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."EVENTIMAGE" MODIFY ("IMGID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."EVENTIMAGE" ADD CONSTRAINT "EVENTIMG_PK" PRIMARY KEY ("IMGID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table FEEDBACK
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."FEEDBACK" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."FEEDBACK" MODIFY ("SUBJECT" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."FEEDBACK" MODIFY ("DESCRIPTION" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."FEEDBACK" MODIFY ("FEED_DATE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."FEEDBACK" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ADMINRECORD
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ADMINRECORD" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ADMINRECORD" MODIFY ("ADMINKEY" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ADMINRECORD" ADD CONSTRAINT "ADMINRECORD_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table STUDENTINFO
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("CLZID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("EMAIL" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("DOB" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("GENDER" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("COURSEID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("SEMID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" MODIFY ("SECTIONID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."STUDENTINFO" ADD CONSTRAINT "STUDENTINFO_PK" PRIMARY KEY ("CLZID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SUBJECTCOURSE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."SUBJECTCOURSE" MODIFY ("COURSEID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SUBJECTCOURSE" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."SUBJECTCOURSE" ADD CONSTRAINT "SUBJECTCOURSE_PK" PRIMARY KEY ("COURSEID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table VENUE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."VENUE" MODIFY ("VENUEID" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."VENUE" MODIFY ("VENUENAME" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."VENUE" ADD CONSTRAINT "VENUE_PK" PRIMARY KEY ("VENUEID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table EVENTINFO
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."EVENTINFO" ADD CONSTRAINT "EVENTINFO_FK1" FOREIGN KEY ("CLUB_FK")
	  REFERENCES "SYSTEM"."CLUB" ("CLUBID") ON DELETE CASCADE ENABLE;
  ALTER TABLE "SYSTEM"."EVENTINFO" ADD CONSTRAINT "EVENTINFO_FK2" FOREIGN KEY ("VENUE_FK")
	  REFERENCES "SYSTEM"."VENUE" ("VENUEID") ON DELETE CASCADE ENABLE;
  ALTER TABLE "SYSTEM"."EVENTINFO" ADD CONSTRAINT "EVENTINFO_FK3" FOREIGN KEY ("IMAGE_FK")
	  REFERENCES "SYSTEM"."EVENTIMAGE" ("IMGID") ON DELETE CASCADE ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table STUDENTINFO
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."STUDENTINFO" ADD CONSTRAINT "STUDENTINFO_FK1" FOREIGN KEY ("COURSEID")
	  REFERENCES "SYSTEM"."SUBJECTCOURSE" ("COURSEID") ON DELETE CASCADE ENABLE;
  ALTER TABLE "SYSTEM"."STUDENTINFO" ADD CONSTRAINT "STUDENTINFO_FK2" FOREIGN KEY ("SECTIONID")
	  REFERENCES "SYSTEM"."SECTION" ("SECTIONID") ON DELETE CASCADE ENABLE;
  ALTER TABLE "SYSTEM"."STUDENTINFO" ADD CONSTRAINT "STUDENTINFO_FK3" FOREIGN KEY ("SEMID")
	  REFERENCES "SYSTEM"."SEMESTER" ("SEMID") ON DELETE CASCADE ENABLE;
