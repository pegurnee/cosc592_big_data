import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;


public enum CodeLanguage implements Writable{
	JS,JAVA,RUBY,PYTHON,PHP,C,CPP,OBJECTIVE_C,SWIFT;

	@Override
	public void readFields(DataInput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(DataOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
