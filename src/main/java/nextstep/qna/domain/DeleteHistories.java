package nextstep.qna.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeleteHistories {
    private final List<DeleteHistory> values;

    public DeleteHistories(List<DeleteHistory> values) {
        this.values = values;
    }

    public DeleteHistories(DeleteHistory deleteHistory, DeleteHistories deleteHistories) {
        this.values = new ArrayList<>();
        this.values.add(deleteHistory);
        this.values.addAll(deleteHistories.values);
    }

    public void saveAll(DeleteHistoryRepository deleteHistoryRepository) {
        deleteHistoryRepository.saveAll(values);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteHistories that = (DeleteHistories) o;
        return Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(values);
    }
}
