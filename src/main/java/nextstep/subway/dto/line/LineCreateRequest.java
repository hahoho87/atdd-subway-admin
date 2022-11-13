package nextstep.subway.dto.line;

public class LineCreateRequest {

	private String name;
	private String color;
	private Long upStationId;
	private Long downStationId;
	private int distance;

	private LineCreateRequest() {
	}

	private LineCreateRequest(String name, String color, Long upStationId, Long downStationId, int distance) {
		this.name = name;
		this.color = color;
		this.upStationId = upStationId;
		this.downStationId = downStationId;
		this.distance = distance;
	}

	public static LineCreateRequest of(String name, String color, Long upStationId, Long downStationId, int distance) {
		return new LineCreateRequest(name, color, upStationId, downStationId, distance);
	}
}
