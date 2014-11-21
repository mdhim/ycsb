package mdhim;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : mdhim-tng-ycsb/src/range_server.h:1383</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mdhim") 
public abstract class mdhim_rs_t extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : work_queue* */
	@Field(0) 
	public Pointer<work_queue > work_queue() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : work_queue* */
	@Field(0) 
	public mdhim_rs_t work_queue(Pointer<work_queue > work_queue) {
		this.io.setPointerField(this, 0, work_queue);
		return this;
	}
	/**
	 * Failed to convert value work_queue_mutex of type pthread_mutex_t*<br>
	 * C type : pthread_mutex_t*
	 */
	/**
	 * Failed to convert value work_ready_cv of type pthread_cond_t*<br>
	 * C type : pthread_cond_t*
	 */
	/** C type : pthread_t */
	@org.bridj.ann.CLong 
	@Field(3) 
	public long listener() {
		return this.io.getCLongField(this, 3);
	}
	/** C type : pthread_t */
	@org.bridj.ann.CLong 
	@Field(3) 
	public mdhim_rs_t listener(long listener) {
		this.io.setCLongField(this, 3, listener);
		return this;
	}
	/** C type : pthread_t** */
	@Field(4) 
	public Pointer<Pointer<org.bridj.CLong > > workers() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : pthread_t** */
	@Field(4) 
	public mdhim_rs_t workers(Pointer<Pointer<org.bridj.CLong > > workers) {
		this.io.setPointerField(this, 4, workers);
		return this;
	}
	/** Conversion Error : index* (failed to convert type to Java (undefined type)) */
	@Field(6) 
	public double put_time() {
		return this.io.getDoubleField(this, 6);
	}
	@Field(6) 
	public mdhim_rs_t put_time(double put_time) {
		this.io.setDoubleField(this, 6, put_time);
		return this;
	}
	@Field(7) 
	public double get_time() {
		return this.io.getDoubleField(this, 7);
	}
	@Field(7) 
	public mdhim_rs_t get_time(double get_time) {
		this.io.setDoubleField(this, 7, get_time);
		return this;
	}
	@org.bridj.ann.CLong 
	@Field(8) 
	public long num_put() {
		return this.io.getCLongField(this, 8);
	}
	@org.bridj.ann.CLong 
	@Field(8) 
	public mdhim_rs_t num_put(long num_put) {
		this.io.setCLongField(this, 8, num_put);
		return this;
	}
	@org.bridj.ann.CLong 
	@Field(9) 
	public long num_get() {
		return this.io.getCLongField(this, 9);
	}
	@org.bridj.ann.CLong 
	@Field(9) 
	public mdhim_rs_t num_get(long num_get) {
		this.io.setCLongField(this, 9, num_get);
		return this;
	}
	/** C type : out_req* */
	@Field(10) 
	public Pointer<out_req > out_req_list() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : out_req* */
	@Field(10) 
	public mdhim_rs_t out_req_list(Pointer<out_req > out_req_list) {
		this.io.setPointerField(this, 10, out_req_list);
		return this;
	}
}