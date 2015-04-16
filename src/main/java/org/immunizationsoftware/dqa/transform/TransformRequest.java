package org.immunizationsoftware.dqa.transform;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.immunizationsoftware.dqa.tester.connectors.Connector;
import org.immunizationsoftware.dqa.tester.transform.Patient;

public class TransformRequest
{
  private PatientType patientType = null;
  private Connector connector = null;
  private String resultText = null;
  private Patient patient = null;
  private String today = null;
  private String tomorrow = null;
  private String now = null;
  private String nowNoTimezone = null;
  private String line = null;
  
  public TransformRequest(String resultTextOriginal) {
    if (!resultTextOriginal.endsWith("\r")) {
      resultTextOriginal += "\r";
    }
    resultText = resultTextOriginal;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    today = sdf.format(new Date());
    Calendar tomorrowCalendar = Calendar.getInstance();
    tomorrowCalendar.add(Calendar.DAY_OF_MONTH, -1);
    tomorrow = sdf.format(tomorrowCalendar.getTime());
    sdf = new SimpleDateFormat("yyyyMMddHHmmssZ");
    now = sdf.format(new Date());
    sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    nowNoTimezone = sdf.format(new Date());
  }

  public PatientType getPatientType() {
    return patientType;
  }

  public void setPatientType(PatientType patientType) {
    this.patientType = patientType;
  }

  public Connector getConnector() {
    return connector;
  }

  public void setConnector(Connector connector) {
    this.connector = connector;
  }

  public String getResultText() {
    return resultText;
  }

  public void setResultText(String resultText) {
    this.resultText = resultText;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public String getToday() {
    return today;
  }

  public void setToday(String today) {
    this.today = today;
  }

  public String getTomorrow() {
    return tomorrow;
  }

  public void setTomorrow(String tomorrow) {
    this.tomorrow = tomorrow;
  }

  public String getNow() {
    return now;
  }

  public void setNow(String now) {
    this.now = now;
  }

  public String getNowNoTimezone() {
    return nowNoTimezone;
  }

  public void setNowNoTimezone(String nowNoTimezone) {
    this.nowNoTimezone = nowNoTimezone;
  }

  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }
  
  
  
}
