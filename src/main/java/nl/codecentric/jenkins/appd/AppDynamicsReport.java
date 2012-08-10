package nl.codecentric.jenkins.appd;

import hudson.model.AbstractBuild;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/** Represents a single performance report */
public class AppDynamicsReport implements Comparable<AppDynamicsReport> {
  //extends AbstractReport
  public final static String END_PERFORMANCE_PARAMETER = ".endperformanceparameter";

  private AppDynamicsBuildAction buildAction;

  private AppDynamicsReport lastBuildReport;

  public int compareTo(AppDynamicsReport appdReport) {
    if (this == appdReport) {
      return 0;
    }
//    return getReportFileName().compareTo(jmReport.getReportFileName());
    return -1;
  }

  //  public int countErrors() {
//    int nbError = 0;
//    for (UriReport currentReport : uriReportMap.values()) {
//      if (buildAction.getPerformanceReportMap().ifSummarizerParserUsed(reportFileName))  {
//        nbError += currentReport.getHttpSampleList().get(0).getSummarizerErrors();
//      } else {
//        nbError += currentReport.countErrors();
//      }
//    }
//    return nbError;
//  }
//
  public double errorPercent() {
//    if (buildAction.getPerformanceReportMap().ifSummarizerParserUsed(reportFileName))  {
//      return size() == 0 ? 0 : ((double) countErrors()) / size();
//    } else {
//      return size() == 0 ? 0 : ((double) countErrors()) / size() * 100;
//    }
    return 5.3;
  }

  //
  public long getAverage() {
    long result = 4700;
//    int size = size();
//    if (size != 0) {
//      long average = 0;
//      for (UriReport currentReport : uriReportMap.values()) {
//        average += currentReport.getAverage() * currentReport.size();
//      }
//      double test = average / size;
//      result = (int) test;
//    }
    return result;
  }

  public long getMax() {
    long max = Long.MIN_VALUE;
//    for (UriReport currentReport : uriReportMap.values()) {
//      max = Math.max(currentReport.getMax(), max);
//    }
    max = 83700;
    return max;
  }

  public long getMin() {
    long min = Long.MAX_VALUE;
//    for (UriReport currentReport : uriReportMap.values()) {
//      min = Math.min(currentReport.getMin(), min);
//    }
    min = 3480;
    return min;
  }

  //
//  public long get90Line() {
//    long result = 0;
//    int size = size();
//    if (size != 0) {
//      long average = 0;
//      List<HttpSample> allSamples = new ArrayList<HttpSample>();
//      for (UriReport currentReport : uriReportMap.values()) {
//        allSamples.addAll(currentReport.getHttpSampleList());
//      }
//      Collections.sort(allSamples);
//      result = allSamples.get((int) (allSamples.size() * .9)).getDuration();
//    }
//    return result;
//  }
//
//  public long getMedian() {
//    long result = 0;
//    int size = size();
//    if (size != 0) {
//      long average = 0;
//      List<HttpSample> allSamples = new ArrayList<HttpSample>();
//      for (UriReport currentReport : uriReportMap.values()) {
//        allSamples.addAll(currentReport.getHttpSampleList());
//      }
//      Collections.sort(allSamples);
//      result = allSamples.get((int) (allSamples.size() * .5)).getDuration();
//    }
//    return result;
//  }
//
//  public String getHttpCode() {
//    return "";
//  }
//
  public AbstractBuild<?, ?> getBuild() {
    return buildAction.getBuild();
  }

  AppDynamicsBuildAction getBuildAction() {
    return buildAction;
  }

  void setBuildAction(AppDynamicsBuildAction buildAction) {
    this.buildAction = buildAction;
  }

  public void setLastBuildReport(AppDynamicsReport lastBuildReport) {
    this.lastBuildReport = lastBuildReport;
  }

//
//  public String getDisplayName() {
//    return Messages.Report_DisplayName();
//  }
//
//  public UriReport getDynamic(String token) throws IOException {
//    return getUriReportMap().get(token);
//  }
//
//  public HttpSample getHttpSample() {
//    return httpSample;
//  }
//

  public String getName() {
    return "AD Response Time report";
  }

  public boolean isFailed() {
    return false; // Was there some error??
  }

  public String encodeUriReport() throws UnsupportedEncodingException {
    StringBuilder sb = new StringBuilder(120);
    sb.append(getStaplerUri()).append(END_PERFORMANCE_PARAMETER);
    return URLEncoder.encode(sb.toString(), "UTF-8");
  }

  public String getStaplerUri() {
    String staplerUri = "http://some/uri/to/report".replace("http:", "").replaceAll("/", "_");

    return staplerUri;
  }


//
//  public List<UriReport> getUriListOrdered() {
//    Collection<UriReport> uriCollection = getUriReportMap().values();
//    List<UriReport> UriReportList = new ArrayList<UriReport>(uriCollection);
//    return UriReportList;
//  }
//
//  public Map<String, UriReport> getUriReportMap() {
//    return uriReportMap;
//  }
//
//
//  public void setHttpSample(HttpSample httpSample) {
//    this.httpSample = httpSample;
//  }
//
//  public void setReportFileName(String reportFileName) {
//    this.reportFileName = reportFileName;
//  }
//
//  public int size() {
//    int size = 0;
//    for (UriReport currentReport : uriReportMap.values()) {
//      size += currentReport.size();
//    }
//    return size;
//  }
//


//  public long getAverageDiff() {
//    if ( lastBuildReport == null ) {
//      return 0;
//    }
//    return getAverage() - lastBuildReport.getAverage();
//  }
//
//  public long getMedianDiff() {
//    if ( lastBuildReport == null ) {
//      return 0;
//    }
//    return getMedian() - lastBuildReport.getMedian();
//  }
//
//  public double getErrorPercentDiff() {
//    if ( lastBuildReport == null ) {
//      return 0;
//    }
//    return errorPercent() - lastBuildReport.errorPercent();
//  }
//
//  public String getLastBuildHttpCodeIfChanged() {
//    return "";
//  }
//
//  public int getSizeDiff() {
//    if ( lastBuildReport == null ) {
//      return 0;
//    }
//    return size() - lastBuildReport.size();
//  }

}