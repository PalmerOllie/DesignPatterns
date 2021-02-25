package designPatterns.structural.bridgeExample;

import java.util.List;

public class HTMLFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Genre");
        builder.append("</th>");
        builder.append("<th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail : details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</tr><td>");
            builder.append(detail.getValue());
            builder.append("</tr></td>");
        }
        builder.append("</table>");

        return builder.toString();
    }
}
