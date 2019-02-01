import csv

def problem(line):
	# TODO: Fill this out

def read_file():
	with open('input.csv') as input_file:
		reader = csv.reader(input_file, delimiter=',')
		lines = []

		for i, row in enumerate(reader):
			if i > 0:
				lines.append(row)
		return lines
	
if __name__ == '__main__':
	input_lines = read_file()

	for line in input_lines:
		problem(line)
