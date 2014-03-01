package savariwala.androidapp;


public abstract class MapPointsActivityBase
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("SavariWala.AndroidApp.MapPointsActivityBase, SavariWala, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MapPointsActivityBase.class, __md_methods);
	}


	public MapPointsActivityBase () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MapPointsActivityBase.class)
			mono.android.TypeManager.Activate ("SavariWala.AndroidApp.MapPointsActivityBase, SavariWala, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MapPointsActivityBase (int p0, int p1, com.google.android.gms.maps.model.LatLng p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == MapPointsActivityBase.class)
			mono.android.TypeManager.Activate ("SavariWala.AndroidApp.MapPointsActivityBase, SavariWala, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.Gms.Maps.Model.LatLng, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}