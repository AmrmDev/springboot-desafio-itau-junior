package desafio.itau.springboot.dto;

import lombok.Getter;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponsedDTO {
    @Getter
    private long count;
    @Getter
    private double sum;
    @Getter
    private double avg;
    @Getter
    private double min;
    @Getter
    private double max;

    public StatisticsResponsedDTO(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.max = stats.getMax();
        this.min = stats.getMin();
    }
}
