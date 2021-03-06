﻿using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Facebook;
using SavariWala.Common;
using Thrift;

namespace SavariWala.AndroidApp
{
	[Activity (Label = "SavariWala", MainLauncher = true)]
	public class LoginActivity : Activity
	{
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Login);

			var btnLogin = FindViewById<Button> (Resource.Id.fbButton);

			btnLogin.Click += (sender, e) => {
				var webAuth = new Intent (this, typeof(FBWebViewAuthActivity));
				webAuth.PutExtra ("AppId", AppCommon.FbAppId);
				webAuth.PutExtra ("ExtendedPermissions", AppCommon.ExtendedPermissions);
				StartActivityForResult (webAuth, 0);
			};
		}

		protected override void OnActivityResult (int requestCode, Result resultCode, Intent data)
		{

			base.OnActivityResult (requestCode, resultCode, data);

			switch (resultCode) {
			case Result.Ok:

				AppCommon.Inst.FbAccessToken = data.GetStringExtra ("AccessToken");
				string error = data.GetStringExtra ("Exception");

				// TODO Localization for facebook errors
				if (!string.IsNullOrEmpty(error))
					Utils.Alert (this, "Failed to Log In", "Reason: " + error, false);
				else {
					try
					{
						AppCommon.Inst.InitUser (data.GetStringExtra ("UserId"));
						this.StartNextActivity<ReqBookingSrcActivity> ();
					}
					catch(TException ex) 
					{
						Utils.HandleTException (this, ex);
					}
				}
				break;
			case Result.Canceled:
				Utils.Alert (this, "Failed to Log In", "User Cancelled", false);
				break;
			default:
				break;
			}
		}

	}
}


