// Gerencia a preparação do ambiente (candidatos)
public class TSEEmployee extends TSEProfessional {
  public void addCandidate(Candidate candidate, Model Model, String password) {
    if (candidate instanceof President)
      Model.addPresidentCandidate((President) candidate, password);
    else if (candidate instanceof FederalDeputy)
      Model.addFederalDeputyCandidate((FederalDeputy) candidate, password);
  }

  public void removeCandidate(Candidate candidate, Model Model, String password) {
    if (candidate instanceof President)
      Model.removePresidentCandidate((President) candidate, password);
    else if (candidate instanceof FederalDeputy)
      Model.removeFederalDeputyCandidate((FederalDeputy) candidate, password);
  }

  public static class Builder {
    protected String user;
    protected String password;

    public Builder user(String user) {
      this.user = user;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public TSEEmployee build() {
      if (user == null)
        throw new IllegalArgumentException("user mustn't be null");

      if (user.isEmpty())
        throw new IllegalArgumentException("user mustn't be empty");

      if (password == null)
        throw new IllegalArgumentException("password mustn't be null");

      if (password.isEmpty())
        throw new IllegalArgumentException("password mustn't be empty");

      return new TSEEmployee(
          this.user,
          this.password);
    }
  }

  protected TSEEmployee(
      String user,
      String password) {
    super(user, password);
  }
}
