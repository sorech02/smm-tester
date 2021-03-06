package org.immregistries.smm.transform.forecast;

public enum ForecastTestPanel {

  AIRA_INTEROP_TESTING(72, "AIRA Interop Testing"),
  TCH_INITIAL(2, "TCH Initial"),
  CDSI_TEST_CASES_V2_1(71, "CDSI v2.1"),
  CDSI_TEST_CASES_V3_0(116, "CDSI v3.0", true),
  IHS_ROLLOUT_2013(18, "IHS Rollout"),
  IHS_FROM_RPMS(12, "IHS from RPMS"),
  VDH(15, "VDH"),
  ADDITIONAL_ENVISION_DTAP(38, "Additional Envision DTaP"),
  ADDITIONAL_ENVISION_FLU(39, "Additional Envision Flu"),
  ADDITIONAL_ENVISION_HEP_A(40, "Additional Envision Hep A"),
  ADDITIONAL_ENVISION_HEP_B(41, "Additional Envision Hep B"),
  ADDITIONAL_ENVISION_HIB(49, "Additional Envision Hib"),
  ADDITIONAL_ENVISION_HPV(42, "Additional Envision HPV"),
  ADDITIONAL_ENVISION_MCV(48, "Additional Envision MCV"),
  ADDITIONAL_ENVISION_MMR(43, "Additional Envision MMR"),
  ADDITIONAL_ENVISION_PCV(44, "Additional Envision PCV"),
  ADDITIONAL_ENVISION_POLIO(45, "Additional Envision polio"),
  ADDITIONAL_ENVISION_ROTA(46, "Additional Envision Rota"),
  ADDITIONAL_ENVISION_VARICELLA(47, "Additional Envision Varicella"),
  ENVISION_ADULT_FLU(23, "Envision Adult Flu"),
  ENVISION_ADULT_HEP_A(24, "Envision Adult Hep A"),
  ENVISION_ADULT_HEP_B(25, "Envision Adult Hep B"),
  ENVISION_ADULT_HIB(37, "Envision Adult Hib"),
  ENVISION_ADULT_MCV(26, "Envision Adult MCV"),
  ENVISION_ADULT_MMR(22, "Envision Adult MMR"),
  ENVISION_ADULT_PNEUMOCOCCAL(27, "Envision Adult Pneumococcal"),
  ENVISION_ADULT_POLIO(29, "Envision Adult Polio"),
  ENVISION_ADULT_TDAP(35, "Envision Adult Tdap"),
  ENVISION_ADULT_VARICELLA(28, "Envision Adult Varicella"),
  ENVISION_JAPANESE_ENCEPHALITIS(32, "Envision Japanese Encephalitis"),
  ENVISION_RABIES(33, "Envision Rabies"),
  ENVISION_TYPHOID(30, "Envision Typhoid"),
  ENVISION_YELLOW_FEVER(34, "Envision Yellow Fever"),
  ENVISION_ZOSTER(31, "Envision Zoster"),

  LOCAL_DEV_TESTING(54, "Development"),
  MCIR_FULL_SAMPLE_JULY_TRY_III_2016(106, "MCIR Full Sample July (TRY III) 2016");
  ;

  private int id = 0;
  private String label = "";
  boolean standard = false;

  public boolean isStandard() {
    return standard;
  }

  public int getId() {
    return id;
  }

  public String getLabel() {
    return label;
  }

  private ForecastTestPanel(int id, String label) {
    this.id = id;
    this.label = label;
  }

  private ForecastTestPanel(int id, String label, boolean standard) {
    this.id = id;
    this.label = label;
    this.standard = standard;
  }
}
