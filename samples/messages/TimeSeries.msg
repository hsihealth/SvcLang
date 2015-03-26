
document TimeSeries
{
	required fields:

	caption string           # The series caption
	key     string           # The series key
	data    map[list[Point]] # A map of data points keyed by measure name
}


